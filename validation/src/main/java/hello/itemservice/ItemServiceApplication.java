package hello.itemservice;

import hello.itemservice.web.validation.ItemValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceApplication /*implements WebMvcConfigurer*/ {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

//	글로벌 설정
//	@Override
//	public Validator getValidator() {
//		return new ItemValidator();
//	}

/*	글로벌 설정을 하면 BeanValidator가 자동 등록되지 않는다.
	참고로 글로벌 설정을 직접 사용하는 경우는 드물다*/
}
