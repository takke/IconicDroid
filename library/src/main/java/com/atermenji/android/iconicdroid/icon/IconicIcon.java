/*
 * Copyright (C) 2013 Artur Termenji
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.atermenji.android.iconicdroid.icon;

import com.atermenji.android.iconicdroid.util.TypefaceManager.IconicTypeface;

/**
 * A wrapper for Iconic icon font (http://somerandomdude.com/work/iconic/). 
 */
public enum IconicIcon implements Icon {

    SEARCH(0xF000),
    MAIL(0xF001),
    HEART(0xF002),
    HEART_EMPTY(0x2661),
    STAR(0x2605),
    USER(0xF003),
    VIDEO(0xF004),
    PICTURE(0xF005),
    CAMERA(0xF006),
    OK(0x2713),
    OK_CIRCLE(0xF007),
    CANCEL(0x2715),
    CANCEL_CIRCLE(0xF008),
    PLUS(0x2B),
    PLUS_CIRCLE(0xF009),
    MINUS(0x2D),
    MINUS_CIRCLE(0xF00A),
    HELP(0xF00B),
    INFO(0xF00C),
    HOME(0x2302),
    LINK(0xF00D),
    ATTACH(0xF00E),
    LOCK(0xF00F),
    LOCK_EMPTY(0xE708),
    LOCK_OPEN(0xF010),
    LOCK_OPEN_EMPTY(0xE709),
    PIN(0xF011),
    EYE(0xE70A),
    TAG(0xE70C),
    TAG_EMPTY(0xE70E),
    DOWNLOAD(0xF012),
    UPLOAD(0xF013),
    DOWNLOAD_CLOUD(0xE710),
    UPLOAD_CLOUD(0xE711),
    QUOTE_LEFT(0x275D),
    QUOTE_RIGHT(0x275E),
    QUOTE_LEFT_ALT(0x275B),
    QUOTE_RIGHT_ALT(0x275C),
    PENCIL(0x270E),
    PENCIL_NEG(0xF014),
    PENCIL_ALT(0x2710),
    UNDO(0x21B6),
    COMMENT(0xE718),
    COMMENT_INV(0xE719),
    COMMENT_ALT(0xE71A),
    COMMENT_INV_ALT(0xE71B),
    COMMENT_ALT2(0xE71C),
    COMMENT_INV_ALT2(0xE71D),
    CHAT(0xE720),
    CHAT_INV(0xE721),
    LOCATION(0xE724),
    LOCATION_INV(0xE725),
    LOCATION_ALT(0xE726),
    COMPASS(0xE728),
    TRASH(0xE729),
    TRASH_EMPTY(0xE72A),
    DOC(0xE730),
    DOC_INV(0xE731),
    DOC_ALT(0xE732),
    DOC_INV_ALT(0xE733),
    ARTICLE(0xE734),
    ARTICLE_ALT(0xE735),
    BOOK_OPEN(0xF015),
    FOLDER(0xF016),
    FOLDER_EMPTY(0xF017),
    BOX(0xF018),
    RSS(0xE73A),
    RSS_ALT(0xE73B),
    COG(0x2699),
    WRENCH(0xF019),
    SHARE(0xE73C),
    CALENDAR(0xF01A),
    CALENDAR_INV(0xE73E),
    CALENDAR_ALT(0xF01B),
    MIC(0xF01C),
    VOLUME_OFF(0xF01D),
    VOLUME_UP(0xF01E),
    HEADPHONES(0xF01F),
    CLOCK(0xF020),
    LAMP(0xF021),
    BLOCK(0xF022),
    RESIZE_FULL(0xE744),
    RESIZE_FULL_ALT(0xE745),
    RESIZE_SMALL(0xE746),
    RESIZE_SMALL_ALT(0xE747),
    RESIZE_VERTICAL(0x2B0C),
    RESIZE_HORIZONTAL(0x2B0D),
    MOVE(0xE74A),
    POPUP(0xE74C),
    DOWN(0x2193),
    LEFT(0x2190),
    RIGHT(0x2192),
    UP(0x2191),
    DOWN_CIRCLE(0xE4A4),
    LEFT_CIRCLE(0xE4A1),
    RIGHT_CIRCLE(0xE4A2),
    UP_CIRCLE(0xE4A3),
    CW(0x27F3),
    LOOP(0xF023),
    LOOP_ALT(0xF024),
    EXCHANGE(0x21C4),
    SPLIT(0x2387),
    ARROW_CURVED(0xF025),
    PLAY(0xF026),
    PLAY_CIRCLE2(0xE048),
    STOP(0xF027),
    PAUSE(0x2389),
    TO_START(0x23EE),
    TO_END(0x23ED),
    EJECT(0x23CF),
    TARGET(0xF028),
    SIGNAL(0xF029),
    AWARD(0xF02A),
    AWARD_EMPTY(0xE764),
    LIST(0xE765),
    LIST_NESTED(0xE766),
    BAT_EMPTY(0xE772),
    BAT_HALF(0xE773),
    BAT_FULL(0xE774),
    BAT_CHARGE(0xE775),
    MOBILE(0xF02B),
    CD(0xF02C),
    EQUALIZER(0xE795),
    CURSOR(0xE796),
    APERTURE(0xE797),
    APERTURE_ALT(0xE798),
    STEERING_WHEEL(0xE799),
    BOOK(0xF02D),
    BOOK_ALT(0xF02E),
    BRUSH(0xE79A),
    BRUSH_ALT(0xE79B),
    EYEDROPPER(0xE79C),
    LAYERS(0xE79D),
    LAYERS_ALT(0xE79E),
    SUN(0x263C),
    SUN_INV(0xF02F),
    CLOUD(0xF030),
    RAIN(0x26C6),
    FLASH(0xF031),
    MOON(0x263E),
    MOON_INV(0xE7A0),
    UMBRELLA(0x2602),
    CHART_BAR(0xF032),
    CHART_PIE(0xE7A2),
    CHART_PIE_ALT(0xE7A3),
    KEY(0x26BF),
    KEY_INV(0xF033),
    HASH(0x23),
    AT(0x40),
    PILCROW(0xB6),
    DIAL(0xE7A4);
    
    private final int mIconUtfValue;

    private IconicIcon(int iconUtfValue) {
        mIconUtfValue = iconUtfValue;
    }

    @Override
    public IconicTypeface getIconicTypeface() {
        return IconicTypeface.ICONIC;
    }

    @Override
    public int getIconUtfValue() {
        return mIconUtfValue;
    }
}
