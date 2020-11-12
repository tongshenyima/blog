package net.jxvtc.blog.service;


import net.jxvtc.blog.po.Blog;
import net.jxvtc.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * Created by limi on 2017/10/20.
 */
public interface BlogService {

    Blog getBlog(Long id);
    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);
    Page<Blog> listBlog(Pageable pageable);
    List<Blog> listRecommendBlogTop(Integer size);
    Page<Blog> listBlog( String query,Pageable pageable);
    Page<Blog> listBlog(Long tagId, Pageable pageable);
    Map<String,List<Blog>> archiveBlog();
    Blog updateBlog(Long id,Blog blog);
Long countBlog();
    void deleteBlog(Long id);
}
