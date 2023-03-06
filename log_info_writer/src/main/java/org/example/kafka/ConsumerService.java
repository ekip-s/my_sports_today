package org.example.kafka;


import lombok.extern.slf4j.Slf4j;
import org.example.model.KafkaMessage;
import org.example.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    private final LogRepository repository;

    @Autowired
    public ConsumerService(LogRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = "application_log_information", groupId = "log_info_writer_001")
    public void consume(KafkaMessage message){
        log.info("Запись лога: {}", message);
        repository.save(message);
    }
}