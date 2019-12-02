package com.adi.decorate_pattern;

public class GiftTest {
    public static void main(String[] args) {
        GiftComponent gift, addColouredRibbon, addGiftBox, addGiftPaper;
        gift = new Gift();
        addColouredRibbon = new AddColouredRibbonDecorate(gift);
        addGiftBox = new AddGiftBoxDecorate(addColouredRibbon);
        addGiftPaper = new AddGiftPaperDecorate(addGiftBox);
        addGiftPaper.show();

    }
}


abstract class GiftComponent{
    public abstract void show();
}

class Gift extends GiftComponent{

    @Override
    public void show() {
        System.out.println("礼物");
    }
}

class GiftDecorate extends GiftComponent{
    private GiftComponent component;

    public GiftDecorate(GiftComponent component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}

class AddColouredRibbonDecorate extends GiftDecorate{
    public AddColouredRibbonDecorate(GiftComponent component) {
        super(component);
    }
    private void addColouredRibbon(){
        System.out.println("添加彩带");
    }
    @Override
    public void show() {
        this.addColouredRibbon();
        super.show();
    }
}

class AddGiftBoxDecorate extends GiftDecorate{
    public AddGiftBoxDecorate(GiftComponent component) {
        super(component);
    }
    private void addGiftBox(){
        System.out.println("添加礼盒");
    }

    @Override
    public void show() {
        this.addGiftBox();
        super.show();
    }
}

class AddGiftPaperDecorate extends GiftDecorate{
    public AddGiftPaperDecorate(GiftComponent component) {
        super(component);
    }
    private void addGiftPaper(){
        System.out.println("添加礼纸");
    }

    @Override
    public void show() {
        this.addGiftPaper();
        super.show();
    }
}