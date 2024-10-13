import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {

    public Caracteristicas buscaMoneda(String busqueda1, String busqueda2 ) {

        //direccion API//
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/294a9af0314b9d30cd011d85/pair/" + busqueda1 + "/" + busqueda2 + "/");

        //pregunta al servidor//
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        //respuesta del servidor//



        try {
            HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Caracteristicas.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
