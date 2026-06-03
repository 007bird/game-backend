package tw.com.live.game_backend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/streams")
	public List<Map<String,Object>> streams(){
		  List<Map<String, Object>> list = new ArrayList<>();
		  
		  Map<String, Object> stream1 = new HashMap<>();
		    stream1.put("id", 1);
		    stream1.put("title", "Minecraft 生存");
		    stream1.put("streamer", "Hamster");

		    Map<String, Object> stream2 = new HashMap<>();
		    stream2.put("id", 2);
		    stream2.put("title", "星海爭霸 II");
		    stream2.put("streamer", "Raynor");

		    list.add(stream1);
		    list.add(stream2);

		    return list;
	}
	
	@GetMapping("/member")
	public  Map<String,Object> member() {;
		
		Map<String,Object> data = new HashMap<>();
	
	    data.put("id", 1);
	    data.put("name", "Hamster");
	    data.put("job", "Backend Student");
	    
	    return data;
	}
	
}
