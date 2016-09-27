package com.tcf.trainings.jenkins.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.tcf.trainings.jenkins.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("com.tcf.trainings.jenkins.timetracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
