package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.common.baseobject.XAndY;
import kr.dogfoot.hwpxlib.object.content.section_xml.enumtype.OLEDrawAspect;
import kr.dogfoot.hwpxlib.object.content.section_xml.enumtype.OLEObjectType;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.picture.LineShape;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.shapecomponent.ShapeComponent;

/**
 * OLE
 */
public class OLE extends ShapeComponent<OLE> {
    /**
     * OLE 객체 종류
     */
    private OLEObjectType objectType;
    /**
     * OLE 객체의 바이너리 데이터에 대한 아이디 참조값
     */
    private String binaryItemIDRef;
    /**
     * moniker 가 있는지 여부
     */
    private Boolean hasMoniker;
    /**
     * 화면에 어떤 형태로 표시될 지에 대한 설정
     */
    private OLEDrawAspect drawAspect;
    /**
     * 수식 객체의 베이스 라인(0~100)
     */
    private Integer eqBaseLine;
    /**
     * 오브젝트의 extent 크기
     */
    private XAndY extent;
    /**
     * 테두리 모양
     */
    private LineShape lineShape;

    public OLE() {
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.hp_ole;
    }

    public OLEObjectType objectType() {
        return objectType;
    }

    public void objectType(OLEObjectType objectType) {
        this.objectType = objectType;
    }

    public OLE objectTypeAnd(OLEObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public String binaryItemIDRef() {
        return binaryItemIDRef;
    }

    public void binaryItemIDRef(String binaryItemIDRef) {
        this.binaryItemIDRef = binaryItemIDRef;
    }

    public OLE binaryItemIDRefAnd(String binaryItemIDRef) {
        this.binaryItemIDRef = binaryItemIDRef;
        return this;
    }

    public Boolean hasMoniker() {
        return hasMoniker;
    }

    public void hasMoniker(Boolean hasMoniker) {
        this.hasMoniker = hasMoniker;
    }

    public OLE hasMonikerAnd(Boolean hasMoniker) {
        this.hasMoniker = hasMoniker;
        return this;
    }

    public OLEDrawAspect drawAspect() {
        return drawAspect;
    }

    public void drawAspect(OLEDrawAspect drawAspect) {
        this.drawAspect = drawAspect;
    }

    public OLE drawAspectAnd(OLEDrawAspect drawAspect) {
        this.drawAspect = drawAspect;
        return this;
    }

    public Integer eqBaseLine() {
        return eqBaseLine;
    }

    public void eqBaseLine(Integer eqBaseLine) {
        this.eqBaseLine = eqBaseLine;
    }

    public OLE eqBaseLineAnd(Integer eqBaseLine) {
        this.eqBaseLine = eqBaseLine;
        return this;
    }

    public XAndY extent() {
        return extent;
    }

    public void createExtent() {
        extent = new XAndY(ObjectType.hc_extent);
    }

    public void removeExtent() {
        extent = null;
    }

    public LineShape lineShape() {
        return lineShape;
    }

    public void createLineShape() {
        lineShape = new LineShape();
    }

    public void removeLineShape() {
        lineShape = null;
    }
}
