package tw.com.live.game_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tw.com.live.game_backend.entity.Stream;

@Service
public class StreamService {

	public List<Stream> getStreams() {

		List<Stream> list = new ArrayList<>();

		list.add(new Stream(1, "Minecraft 生存", "Hamster"));
		list.add(new Stream(2, "星海爭霸 II", "Raynor"));

		return list;
	}
}