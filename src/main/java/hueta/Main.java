package hueta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Set;


public class Main {

    static long lo = 0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Huy1());
        thread1.start();
        Thread thread2 = new Thread(new Huy1());
        thread2.start();
        Thread thread3 = new Thread(new Huy1());
        thread3.start();
        Thread thread4 = new Thread(new Huy1());
        thread4.start();
        Thread thread5 = new Thread(new Huy1());
        thread5.start();
        Thread thread6 = new Thread(new Huy1());
        thread6.start();
        Thread thread7 = new Thread(new Huy1());
        thread7.start();
        Thread thread8 = new Thread(new Huy1());
        thread8.start();
        Thread thread9 = new Thread(new Huy1());
        thread9.start();
        Thread thread10 = new Thread(new Huy1());
        thread10.start();
        Thread thread11 = new Thread(new Huy1());
        thread11.start();
        Thread thread12 = new Thread(new Huy1());
        thread12.start();
        Thread thread13 = new Thread(new Huy1());
        thread13.start();
        Thread thread14 = new Thread(new Huy1());
        thread14.start();
        Thread thread15 = new Thread(new Huy1());
        thread15.start();
        Thread thread16 = new Thread(new Huy1());
        thread16.start();
        Thread thread17 = new Thread(new Huy1());
        thread17.start();
        Thread thread18 = new Thread(new Huy1());
        thread18.start();
        Thread thread19 = new Thread(new Huy1());
        thread19.start();
        Thread thread20 = new Thread(new Huy1());
        thread20.start();
        Thread thread21 = new Thread(new Huy1());
        thread21.start();
        Thread thread22 = new Thread(new Huy1());
        thread22.start();
        Thread thread23 = new Thread(new Huy1());
        thread23.start();
        Thread thread24 = new Thread(new Huy1());
        thread24.start();
        Thread thread25 = new Thread(new Huy1());
        thread25.start();
        Thread thread26 = new Thread(new Huy1());
        thread26.start();
        Thread thread27 = new Thread(new Huy1());
        thread27.start();
        Thread thread28 = new Thread(new Huy1());
        thread28.start();
    }
}

class Huy1 implements Runnable {
//    long lo = 0L;

    Role role1 = new Role(1L, "ROLE_USER");
    Set<Role> role = Set.of(role1);
    Dto dto = new Dto(1L, "Писькалиций" + Main.lo, "123", 1, "pidor", role);
    HttpHeaders httpHeaders = new HttpHeaders();
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public void run() {

        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> httpEntity = new HttpEntity<>(dto, httpHeaders);
        while (true) {
            System.out.println(Thread.currentThread().getName());
            dto.setName("Писькалиций" + Main.lo);
//            restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
            restTemplate.exchange("http://localhost:8080/api/users/", HttpMethod.POST, httpEntity, Dto.class);
            Main.lo++;
            System.out.println(Main.lo);
        }
    }
}


