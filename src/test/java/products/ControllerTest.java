package products;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Test;

class ControllerTest {
    @Test
    void 商品一覧画面表示テスト() throws Exception {

        // HTTPクライアントを作成
        HttpClient client = HttpClient.newHttpClient();

        // 商品一覧画面へリクエスト
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/products/index.jsp"))
                .GET()
                .build();

        // HTTPレスポンスを取得
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // HTTPステータスが200であることを確認
        assertEquals(200, response.statusCode());

       // 画面に商品一覧という文字が存在することを検証
        assertTrue(response.body().contains("商品一覧"));
    }
}
