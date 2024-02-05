import com.fasterxml.jackson.databind.ext.JodaSerializers.DateMidnightSerializer;
public class FunctionUse2038 {
public void funcUse() {
DateMidnightSerializer datemidnightserializer = new DateMidnightSerializer();
datemidnightserializer.getSchema(null,null);
}
}