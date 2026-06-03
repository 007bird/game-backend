package tw.com.live.game_backend.entity;

public class Stream {

	private Integer id;
	private String title;
	private String streamer;

	public Stream(Integer id, String title, String streamer) {
		super();
		this.id = id;
		this.title = title;
		this.streamer = streamer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStreamer() {
		return streamer;
	}

	public void setStreamer(String streamer) {
		this.streamer = streamer;
	}

}