package ao.it.chandsoft.usersweb.http;

import org.springframework.web.client.RestTemplate;

public class Request {

    public <T> T get(String url, Class<T> clazz) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, clazz);
    }

    public <T> T post(String url, Object obj, Class<T> clazz) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(url, obj, clazz);
    }
}
