package com.wechat.model.message.response;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 类名：NewsMessage
 * 开发人员: Ju
 * 创建时间: 2018/5/31 21:26
 * 描述: 回复图文消息
 * 版本：V1.0
 */
public class NewsRespMessage extends BaseRespMessage {
    // 图文消息个数，限制为10条以内
    private int ArticleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Article> Articles;

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }
}
