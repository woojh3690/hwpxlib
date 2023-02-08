package kr.dogfoot.hwpxlib.reader.header_xml.borderfill;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;
import kr.dogfoot.hwpxlib.object.content.header_xml.enumtype.CenterLineSort;
import kr.dogfoot.hwpxlib.object.content.header_xml.references.BorderFill;
import kr.dogfoot.hwpxlib.object.content.header_xml.references.borderfill.*;
import kr.dogfoot.hwpxlib.reader.common.ElementReader;
import kr.dogfoot.hwpxlib.reader.common.ElementReaderSort;
import kr.dogfoot.hwpxlib.reader.util.ValueConvertor;
import kr.dogfoot.hwpxlib.util.AttributeNames;
import kr.dogfoot.hwpxlib.util.ElementNames;
import org.xml.sax.Attributes;

public class BorderFillReader extends ElementReader {
    private BorderFill borderFill;

    @Override
    public ElementReaderSort sort() {
        return ElementReaderSort.BorderFill;
    }

    @Override
    protected void setAttribute(String name, String value) {
        switch (name) {
            case AttributeNames.id:
                borderFill.id(value);
                break;
            case AttributeNames.threeD:
                borderFill.threeD(ValueConvertor.toBoolean(value));
                break;
            case AttributeNames.shadow:
                borderFill.shadow(ValueConvertor.toBoolean(value));
                break;
            case AttributeNames.centerLine:
                borderFill.centerLine(CenterLineSort.fromString(value));
                break;
            case AttributeNames.breakCellSeparateLine:
                borderFill.breakCellSeparateLine(ValueConvertor.toBoolean(value));
                break;
        }
    }

    @Override
    public void childElement(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.Slash:
                borderFill.createSlash();
                slash(borderFill.slash(), name, attrs);
                break;
            case ElementNames.BackSlash:
                borderFill.createBackSlash();
                backSlash(borderFill.backSlash(), name, attrs);
                break;
            case ElementNames.LeftBorder:
                borderFill.createLeftBorder();
                leftBorder(borderFill.leftBorder(), name, attrs);
                break;
            case ElementNames.RightBorder:
                borderFill.createRightBorder();
                rightBorder(borderFill.rightBorder(), name, attrs);
                break;
            case ElementNames.TopBorder:
                borderFill.createTopBorder();
                topBorder(borderFill.topBorder(), name, attrs);
                break;
            case ElementNames.BottomBorder:
                borderFill.createBottomBorder();
                bottomBorder(borderFill.bottomBorder(), name, attrs);
                break;
            case ElementNames.Diagonal:
                borderFill.createDiagonal();
                diagonal(borderFill.diagonal(), name, attrs);
                break;
            case ElementNames.FillBrush:
                borderFill.createFillBrush();
                fillBrush(borderFill.fillBrush(), name, attrs);
                break;
        }
    }

    @Override
    public HWPXObject childElementInSwitch(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.Slash:
                Slash slash = new Slash();
                slash(slash, name, attrs);
                return slash;
            case ElementNames.BackSlash:
                BackSlash backSlash = new BackSlash();
                backSlash(backSlash, name, attrs);
                return backSlash;
            case ElementNames.LeftBorder:
                LeftBorder leftBorder = new LeftBorder();
                leftBorder(leftBorder, name, attrs);
                return leftBorder;
            case ElementNames.RightBorder:
                RightBorder rightBorder = new RightBorder();
                rightBorder(rightBorder, name, attrs);
                return rightBorder;
            case ElementNames.TopBorder:
                TopBorder topBorder = new TopBorder();
                topBorder(topBorder, name, attrs);
                return topBorder;
            case ElementNames.BottomBorder:
                BottomBorder bottomBorder = new BottomBorder();
                bottomBorder(bottomBorder, name, attrs);
                return bottomBorder;
            case ElementNames.Diagonal:
                DiagonalBorder diagonal = new DiagonalBorder();
                diagonal(diagonal, name, attrs);
                return diagonal;
            case ElementNames.FillBrush:
                FillBrush fillBrush = new FillBrush();
                fillBrush(fillBrush, name, attrs);
                return fillBrush;
        }
        return null;
    }

    private void slash(Slash slash, String name, Attributes attrs) {
        ((SlashReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.Slash))
                .slash(slash);

        xmlFileReader().startElement(name, attrs);
    }

    private void backSlash(BackSlash backSlash, String name, Attributes attrs) {
        ((SlashReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.Slash))
                .slash(backSlash);

        xmlFileReader().startElement(name, attrs);
    }

    private void leftBorder(LeftBorder leftBorder, String name, Attributes attrs) {
        ((BorderReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.Border))
                .border(leftBorder);

        xmlFileReader().startElement(name, attrs);
    }

    private void rightBorder(RightBorder rightBorder, String name, Attributes attrs) {
        ((BorderReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.Border))
                .border(rightBorder);

        xmlFileReader().startElement(name, attrs);
    }

    private void topBorder(TopBorder topBorder, String name, Attributes attrs) {
        ((BorderReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.Border))
                .border(topBorder);

        xmlFileReader().startElement(name, attrs);
    }

    private void bottomBorder(BottomBorder bottomBorder, String name, Attributes attrs) {
        ((BorderReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.Border))
                .border(bottomBorder);

        xmlFileReader().startElement(name, attrs);
    }

    private void diagonal(DiagonalBorder diagonal, String name, Attributes attrs) {
        ((BorderReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.Border))
                .border(diagonal);

        xmlFileReader().startElement(name, attrs);
    }

    private void fillBrush(FillBrush fillBrush, String name, Attributes attrs) {
        ((FillBrushReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.FillBrush))
                .fillBrush(fillBrush);

        xmlFileReader().startElement(name, attrs);
    }

    @Override
    public SwitchableObject switchableObject() {
        return borderFill;
    }

    public void borderFill(BorderFill borderFill) {
        this.borderFill = borderFill;
    }
}
