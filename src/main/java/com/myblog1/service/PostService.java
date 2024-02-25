package com.myblog1.service;

import com.myblog1.payloads.PostDto;

public interface PostService {
    PostDto savePost(PostDto postDto);
}
