package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "log_information")
public class KafkaMessage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "app_name")
    private String appName;
    @Column(name = "module_name")
    private String moduleName;
    @Column(name = "method_type")
    @Enumerated(EnumType.ORDINAL)
    private MethodType type;
    @Column(name = "level_name")
    @Enumerated(EnumType.ORDINAL)
    private LevelName level;
    @Column(name = "time_stamp")
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime timeStamp;
    private String message;
}
