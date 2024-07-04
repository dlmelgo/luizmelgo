package com.melgo.sysarch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

@Data
@Document(collection = "bangkas")
public class Bangka {
    @Id
    private ObjectId id;
    private String name;
    private Double price;
    private String portArea;
}
