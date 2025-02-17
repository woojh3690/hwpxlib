package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.ctrl;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.content.section_xml.enumtype.ApplyPageType;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.CtrlItem;

/**
 * 홀수/짝수 조정 ??
 */
public class PageNumCtrl extends CtrlItem {
    private ApplyPageType pageStartsOn;

    public PageNumCtrl() {
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.hp_pageNumCtrl;
    }

    public ApplyPageType pageStartsOn() {
        return pageStartsOn;
    }

    public void pageStartsOn(ApplyPageType pageStartsOn) {
        this.pageStartsOn = pageStartsOn;
    }

    public PageNumCtrl pageStartsOnAnd(ApplyPageType pageStartsOn) {
        this.pageStartsOn = pageStartsOn;
        return this;
    }
}
