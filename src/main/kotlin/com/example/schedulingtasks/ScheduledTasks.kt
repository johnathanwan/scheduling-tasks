package com.example.schedulingtasks

import mu.*
import org.springframework.scheduling.annotation.*
import org.springframework.stereotype.*
import java.text.*
import java.util.*

@Component
class ScheduledTasks {

    companion object {
        private val logger = KotlinLogging.logger {}
        private val dateFormat = SimpleDateFormat("HH:mm:ss")
    }

    @Scheduled(fixedRate = 5000)
    fun reportCurrentTime() {
       logger.info ("The time is now {}", dateFormat.format(Date()))
    }

}