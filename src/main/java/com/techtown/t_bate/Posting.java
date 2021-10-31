package com.techtown.t_bate;

import android.widget.EditText;

public class Posting {
    String postingName;
    String postingContent;

    public Posting(String postingName, String postingContent) {
        this.postingName = postingName;
        this.postingContent = postingContent;
    }

    public String getPostingName() {
        return postingName;
    }

    public void setPostingName() {
        this.postingName = postingName;
    }

    public String getPostingContent() {
        return postingContent;
    }

    public void setPostingContent() {
        this.postingContent = postingContent;
    }
}
