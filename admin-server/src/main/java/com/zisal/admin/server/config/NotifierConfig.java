package com.zisal.admin.server.config;

import de.codecentric.boot.admin.notify.LoggingNotifier;
import de.codecentric.boot.admin.notify.RemindingNotifier;
import de.codecentric.boot.admin.notify.filter.FilteringNotifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2/26/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Configuration
@EnableScheduling
public class NotifierConfig {

    @Bean
    public LoggingNotifier loggingNotifier() {
        return new LoggingNotifier();
    }

    @Bean
    public FilteringNotifier filteringNotifier() {
        return new FilteringNotifier(loggingNotifier());
    }

    @Bean
    @Primary
    public RemindingNotifier remindingNotifier() {
        RemindingNotifier remindingNotifier = new RemindingNotifier(filteringNotifier());
        remindingNotifier.setReminderPeriod(TimeUnit.MINUTES.toMillis(5));
        return remindingNotifier;
    }

    @Scheduled(fixedRate = 60_000L)
    public void remind() {
        remindingNotifier().sendReminders();
    }
}
