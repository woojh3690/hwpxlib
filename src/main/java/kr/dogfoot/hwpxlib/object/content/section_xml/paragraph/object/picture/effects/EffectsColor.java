package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.picture.effects;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;
import kr.dogfoot.hwpxlib.object.content.section_xml.enumtype.ColorType;

public class EffectsColor extends SwitchableObject {
    /**
     * 색상 표현 방식
     */
    private ColorType type;
    /**
     * 스키마 인덱스
     */
    private Integer schemeIdx;
    /**
     * 시스템 인덱스
     */
    private Integer systemIdx;
    /**
     * 프리셋 인덱스
     */
    private Integer presetIdx;
    /**
     * RGB 색상
     */
    private ColorRGB rgb;
    /**
     * CMYK 색상
     */
    private ColorCMYK cmyk;
    /**
     * 스키마 색상
     */
    private ColorScheme scheme;
    /**
     * 시스템 색상
     */
    private ColorSystem system;
    /**
     * 색상 효과
     */
    private ColorEffect effect;

    public EffectsColor() {
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.hp_effectsColor;
    }

    public ColorType type() {
        return type;
    }

    public void type(ColorType type) {
        this.type = type;
    }

    public EffectsColor typeAnd(ColorType type) {
        this.type = type;
        return this;
    }

    public Integer schemeIdx() {
        return schemeIdx;
    }

    public void schemeIdx(Integer schemeIdx) {
        this.schemeIdx = schemeIdx;
    }

    public EffectsColor schemeIdxAnd(Integer schemeIdx) {
        this.schemeIdx = schemeIdx;
        return this;
    }

    public Integer systemIdx() {
        return systemIdx;
    }

    public void systemIdx(Integer systemIdx) {
        this.systemIdx = systemIdx;
    }

    public EffectsColor systemIdxAnd(Integer systemIdx) {
        this.systemIdx = systemIdx;
        return this;
    }

    public Integer presetIdx() {
        return presetIdx;
    }

    public void presetIdx(Integer presetIdx) {
        this.presetIdx = presetIdx;
    }

    public EffectsColor presetIdxAnd(Integer presetIdx) {
        this.presetIdx = presetIdx;
        return this;
    }

    public ColorRGB rgb() {
        return rgb;
    }

    public void createRgb() {
        rgb = new ColorRGB();
    }

    public void removeRgb() {
        rgb = null;
    }

    public ColorCMYK cmyk() {
        return cmyk;
    }

    public void createCmyk() {
        cmyk = new ColorCMYK();
    }

    public void removeCmyk() {
        cmyk = null;
    }

    public ColorScheme scheme() {
        return scheme;
    }

    public void createScheme() {
        scheme = new ColorScheme();
    }

    public void removeScheme() {
        scheme = null;
    }

    public ColorSystem system() {
        return system;
    }

    public void createSystem() {
        system = new ColorSystem();
    }

    public void removeSystem() {
        system = null;
    }

    public ColorEffect effect() {
        return effect;
    }

    public void createEffect() {
        effect = new ColorEffect();
    }

    public void removeEffect() {
        effect = null;
    }
}
