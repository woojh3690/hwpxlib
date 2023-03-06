package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.ctrl;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.ctrl.inner.FootNoteEndNoteCore;

/**
 * 각주
 */
public class FootNote extends FootNoteEndNoteCore<FootNote> {
    public FootNote() {
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.hp_footNote;
    }
}
