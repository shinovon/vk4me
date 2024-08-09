package ru.curoviyxru.phoenix.ui;

import ru.curoviyxru.j2vk.api.objects.Attachment;

public class UserAudioView extends AttachmentView {

	public int index;
	public long ownerid;
	
	public UserAudioView(Attachment a, int idx, long id) {
		super(a);
		this.index = idx;
		this.ownerid = id;
	}

}
