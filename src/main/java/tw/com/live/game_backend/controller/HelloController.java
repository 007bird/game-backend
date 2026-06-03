package tw.com.live.game_backend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.live.game_backend.entity.Stream;

@RestController
public class HelloController {

	@GetMapping("/")
    public String hello() {
        return "Hello Spring Boot";
    }

    @GetMapping("/hamster")
    public String hamster() {
        return "倉鼠萬歲!";
    }
//	@GetMapping("/streams")
//	public List<Stream> streams() {
//
//		List<Stream> list = new ArrayList<>();
//
//		list.add(new Stream(1, "Minecraft 生存", "Hamster"));
//		list.add(new Stream(2, "星海爭霸II", "Raynor"));
//
//		return list;
//	}

	@GetMapping("/member")
	public Map<String, Object> member() {
		;

		Map<String, Object> data = new HashMap<>();

		data.put("id", 1);
		data.put("name", "Hamster");
		data.put("job", "Backend Student");

		return data;
	}

}
