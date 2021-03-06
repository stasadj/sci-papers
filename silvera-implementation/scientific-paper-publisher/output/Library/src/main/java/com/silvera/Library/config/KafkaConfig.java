/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-19 13:06:03
*/

package com.silvera.Library.config;

import com.silvera.Library.messages.Message;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import java.util.HashMap;
import java.util.Map;


@EnableKafka
@Configuration
public class KafkaConfig {

    

    @Bean
    public ConsumerFactory<String, com.silvera.Library.messages.publicationmsggroup.PaperPublished> publicationmsggroupPaperPublishedConsumerFactory(){
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "Library1");

        // Used for deserialization of Message object.
        JsonDeserializer deserializer = new JsonDeserializer<>(com.silvera.Library.messages.publicationmsggroup.PaperPublished.class);
        deserializer.setRemoveTypeHeaders(false);
        deserializer.addTrustedPackages("*");
        deserializer.setUseTypeMapperForKey(true);

        return new DefaultKafkaConsumerFactory<>(
                props,
                new StringDeserializer(),
                deserializer);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.silvera.Library.messages.publicationmsggroup.PaperPublished> publicationmsggroupPaperPublishedKafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, com.silvera.Library.messages.publicationmsggroup.PaperPublished> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(publicationmsggroupPaperPublishedConsumerFactory());
        return factory;
    }
    

    
    @Bean
    public NewTopic topic1(){
        return new NewTopic("PUBLISH_PAPER",1, (short) 1);
    }
    

}