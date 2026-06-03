package tw.com.live.game_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.live.game_backend.entity.Stream;
import tw.com.live.game_backend.service.StreamService;

@RestController
public class StreamController {

	private final StreamService streamService;

	public StreamController(StreamService streamService) {
		this.streamService = streamService;
	}

	@GetMapping("/streams")
	public List<Stream> streams() {
		return streamService.getStreams();
	}
	
	@PostMapping("/streams")
	public String addStream() {

	    return "新增直播成功";
	}
}