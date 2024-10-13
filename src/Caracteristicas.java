import com.google.gson.annotations.SerializedName;

public record Caracteristicas(String base_code,
                              String target_code,
                              double conversion_rate) {


    @Override
    public String toString() {
        return "moneda de entrada= " + base_code +
                " moneda de salida= " + target_code +
                " Conversion de moneda " + conversion_rate;
    }
}
