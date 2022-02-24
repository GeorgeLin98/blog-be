package com.george.blog.service;

import com.george.blog.pojo.ArticleBodyVO;

/**
 * @description 文章正文service接口
 * @author georgeLin
 * @date 2022-01-11-21:11
 */
public interface IArticleBodyService {
    /**
     * @description 查询文章正文
     * @param articleId
     * @return
     */
    ArticleBodyVO findArticleBody(Long articleId);
}
