package com.kijmaster;

import org.bson.codecs.pojo.annotations.BsonId;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.runtime.annotations.RegisterForReflection;

@MongoEntity(collection = "data", database = "demo")
@RegisterForReflection
public class Data extends PanacheMongoEntityBase
{

    @BsonId
    private String key;

    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

}
