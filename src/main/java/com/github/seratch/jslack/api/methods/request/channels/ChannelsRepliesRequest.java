package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChannelsRepliesRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String threadTs;
}