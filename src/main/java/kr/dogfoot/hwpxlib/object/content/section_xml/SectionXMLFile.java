package kr.dogfoot.hwpxlib.object.content.section_xml;

import kr.dogfoot.hwpxlib.object.common.ObjectType;

/**
 * Section.xml 파일
 */
public class SectionXMLFile extends ParaListCore {
    public SectionXMLFile() {
    }

    @Override
    public ObjectType objectType() {
        return ObjectType.Section_XMLFile;
    }
}
