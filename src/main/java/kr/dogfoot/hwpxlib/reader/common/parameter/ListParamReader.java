package kr.dogfoot.hwpxlib.reader.common.parameter;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;
import kr.dogfoot.hwpxlib.object.common.parameter.*;
import kr.dogfoot.hwpxlib.reader.common.ElementReader;
import kr.dogfoot.hwpxlib.reader.common.ElementReaderSort;
import kr.dogfoot.hwpxlib.util.AttributeNames;
import kr.dogfoot.hwpxlib.util.ElementNames;
import org.xml.sax.Attributes;

public class ListParamReader extends ElementReader {
    private ListParam listParam;

    @Override
    public ElementReaderSort sort() {
        return ElementReaderSort.ListParam;
    }

    public void listParam(ListParam listParam) {
        this.listParam = listParam;
    }

    @Override
    protected void setAttribute(String name, String value) {
        switch (name) {
            case AttributeNames.name:
                listParam.name(value);
                break;
        }
    }

    @Override
    public void childElement(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.IntegerParam:
                integerParam(listParam.addNewIntegerParam(), name, attrs);
                break;
            case ElementNames.StringParam:
                stringParam(listParam.addNewStringParam(), name, attrs);
                break;
            case ElementNames.BooleanParam:
                booleanParam(listParam.addNewBooleanParam(), name, attrs);
                break;
            case ElementNames.FloatParam:
                floatParam(listParam.addNewFloatParam(), name, attrs);
                break;
            case ElementNames.ListParam:
                listParam(listParam.addNewListParam(), name, attrs);
                break;
        }
    }

    @Override
    public HWPXObject childElementInSwitch(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.IntegerParam:
                IntegerParam integerParam = new IntegerParam();
                integerParam(integerParam, name, attrs);
                return integerParam;
            case ElementNames.StringParam:
                StringParam stringParam = new StringParam();
                stringParam(stringParam, name, attrs);
                return stringParam;
            case ElementNames.BooleanParam:
                BooleanParam booleanParam = new BooleanParam();
                booleanParam(booleanParam, name, attrs);
                return booleanParam;
            case ElementNames.FloatParam:
                FloatParam floatParam = new FloatParam();
                floatParam(floatParam, name, attrs);
                return floatParam;
            case ElementNames.ListParam:
                ListParam listParam = new ListParam();
                listParam(listParam, name, attrs);
                return listParam;
        }
        return null;
    }

    private void integerParam(IntegerParam integerParam, String name, Attributes attrs) {
        ((IntegerParamReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.IntegerParam))
                .integerParam(integerParam);

        xmlFileReader().startElement(name, attrs);
    }

    private void stringParam(StringParam stringParam, String name, Attributes attrs) {
        ((StringParamReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.StringParam))
                .stringParam(stringParam);

        xmlFileReader().startElement(name, attrs);
    }

    private void booleanParam(BooleanParam booleanParam, String name, Attributes attrs) {
        ((BooleanParamReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.BooleanParam))
                .booleanParam(booleanParam);

        xmlFileReader().startElement(name, attrs);
    }

    private void floatParam(FloatParam floatParam, String name, Attributes attrs) {
        ((FloatParamReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.FloatParam))
                .floatParam(floatParam);

        xmlFileReader().startElement(name, attrs);
    }

    private void listParam(ListParam listParam, String name, Attributes attrs) {
        ((ListParamReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.ListParam))
                .listParam(listParam);

        xmlFileReader().startElement(name, attrs);
    }

    @Override
    public SwitchableObject switchableObject() {
        return listParam;
    }
}
