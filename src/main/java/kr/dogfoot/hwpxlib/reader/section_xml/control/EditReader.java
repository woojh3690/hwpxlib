package kr.dogfoot.hwpxlib.reader.section_xml.control;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;
import kr.dogfoot.hwpxlib.object.content.header_xml.enumtype.HorizontalAlign1;
import kr.dogfoot.hwpxlib.object.content.section_xml.enumtype.DisplayScrollBar;
import kr.dogfoot.hwpxlib.object.content.section_xml.enumtype.TabKeyBehavior;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.Edit;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.edit.EditText;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.formobject.FormObject;
import kr.dogfoot.hwpxlib.reader.common.ElementReaderSort;
import kr.dogfoot.hwpxlib.reader.common.baseobject.HasOnlyTextReader;
import kr.dogfoot.hwpxlib.reader.section_xml.control.formobject.FormObjectReader;
import kr.dogfoot.hwpxlib.reader.util.ValueConvertor;
import kr.dogfoot.hwpxlib.util.AttributeNames;
import kr.dogfoot.hwpxlib.util.ElementNames;
import org.xml.sax.Attributes;

public class EditReader extends FormObjectReader {
    private Edit edit;

    @Override
    public ElementReaderSort sort() {
        return ElementReaderSort.Edit;
    }

    @Override
    public FormObject formObject() {
        return edit;
    }

    public void edit(Edit edit) {
        this.edit = edit;
    }

    @Override
    protected void setAttribute(String name, String value) {
        switch (name) {
            case AttributeNames.multiLine:
                edit.multiLine(ValueConvertor.toBoolean(value));
                break;
            case AttributeNames.passwordChar:
                edit.passwordChar(value);
                break;
            case AttributeNames.maxLength:
                edit.maxLength(ValueConvertor.toInteger(value));
                break;
            case AttributeNames.scrollBars:
                edit.scrollBars(DisplayScrollBar.fromString(value));
                break;
            case AttributeNames.tabKeyBehavior:
                edit.tabKeyBehavior(TabKeyBehavior.fromString(value));
                break;
            case AttributeNames.numOnly:
                edit.numOnly(ValueConvertor.toBoolean(value));
                break;
            case AttributeNames.readOnly:
                edit.readOnly(ValueConvertor.toBoolean(value));
                break;
            case AttributeNames.alignText:
                edit.alignText(HorizontalAlign1.fromString(value));
                break;
            default:
                super.setAttribute(name, value);
                break;
        }
    }


    @Override
    public void childElement(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.hp_text:
                text(edit.text(), name, attrs);
                break;
            default:
                super.childElement(name, attrs);
                break;
        }
    }

    @Override
    public HWPXObject childElementInSwitch(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.hp_seg:
                EditText text = new EditText();
                text(text, name, attrs);
                return text;
        }

        return super.childElementInSwitch(name, attrs);
    }

    private void text(EditText text, String name, Attributes attrs) {
        ((HasOnlyTextReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.HasOnlyText))
                .hasOnlyText(text);

        xmlFileReader().startElement(name, attrs);
    }

    @Override
    public SwitchableObject switchableObject() {
        return edit;
    }
}
