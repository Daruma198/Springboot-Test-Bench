package dev.local.springboot_test_bench.configs;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import dev.local.springboot_test_bench.utils.AppUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;

public class DateSerializerJackson extends JsonSerializer<Date> {
    static Logger LOGGER = LoggerFactory.getLogger(DateSerializerJackson.class);

    public DateSerializerJackson() {
    }

    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (date != null) {
            jsonGenerator.writeString(AppUtil.dateToString(date));
        }

    }
}