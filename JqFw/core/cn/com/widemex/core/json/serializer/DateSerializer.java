package cn.com.widemex.core.json.serializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import cn.com.widemex.core.utils.data.DateHelper;

public class DateSerializer  extends JsonSerializer<Date>{
	@Override
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = DateHelper.TIMESTAMP_FORMAT.format(value);
            jgen.writeString(formattedDate);
    }
}
