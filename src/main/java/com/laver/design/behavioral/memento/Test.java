package com.laver.design.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("design pattern A", "AAAAAAAAAAAAAAAA", "imgs--A");

        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题:"+article.getTitle()+"内容:"+article.getContent()+"图像:"+article.getImgs());

        System.out.println("手记完整信息:"+article);

        System.out.println("修改手记start");

        article.setTitle("design pattern B");
        article.setContent("BBBBBBBBBBBBBBBBBBB");
        article.setImgs("imgs----B");

        System.out.println("修改手记end");

        System.out.println("手记完整信息:"+article);

        articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);

        article.setTitle("design pattern C");
        article.setContent("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        article.setImgs("imgs----C");

        System.out.println("暂存退回start");

        System.out.println("退回出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("退回出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存退回end");
        System.out.println("手记完整信息:"+article);
    }
}
