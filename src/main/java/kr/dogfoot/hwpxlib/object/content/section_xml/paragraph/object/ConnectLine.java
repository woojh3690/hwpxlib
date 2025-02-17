package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.content.section_xml.enumtype.ConnectLineType;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.connectline.ConnectLinePoint;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.drawingobject.DrawingObject;

/**
 * 연결선
 */
public class ConnectLine extends DrawingObject<ConnectLine> {
    /**
     * 연결선 종류
     */
    private ConnectLineType type;
    /**
     * 시작점
     */
    private ConnectLinePoint startPt;
    /**
     * 끝점
     */
    private ConnectLinePoint endPt;

    public ConnectLine() {
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.hp_connectLine;
    }

    public ConnectLineType type() {
        return type;
    }

    public void type(ConnectLineType type) {
        this.type = type;
    }

    public ConnectLine typeAnd(ConnectLineType type) {
        this.type = type;
        return this;
    }

    public ConnectLinePoint startPt() {
        return startPt;
    }

    public void createStartPt() {
        startPt = new ConnectLinePoint(ObjectType.hp_startPt);
    }

    public void removeStartPt() {
        startPt = null;
    }

    public ConnectLinePoint endPt() {
        return endPt;
    }

    public void createEndPt() {
        endPt = new ConnectLinePoint(ObjectType.hp_endPt);
    }

    public void removeEndPt() {
        endPt = null;
    }
}
