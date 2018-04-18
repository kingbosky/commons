package com.kingbosky.commons.model.result;

import java.util.Map;

public class MapResult<K, V> extends BaseResult{
	private static final long serialVersionUID = 2572747488462610245L;
	private Map<K, V> content;
	
	public MapResult() {
		super();
	}

	public MapResult(Map<K, V> content) {
		super();
		this.content = content;
	}

	public Map<K, V> getContent() {
		return content;
	}

	public void setContent(Map<K, V> content) {
		this.content = content;
	}
}
