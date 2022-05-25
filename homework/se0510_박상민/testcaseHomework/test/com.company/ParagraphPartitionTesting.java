package com.company;

import org.junit.jupiter.api.Test;

import static com.company.Paragraph.catWhiteSpace;

/** 첫 번째는, 입력 string의 공백 위치에 따른 동등분할 테스트 케이스
 *  1. 문장 자체가 존재 하지 않는 경우 (NULL)
 *  2. 공백이 문장의 맨 앞에 위치 하는 경우
 *  3. 공백이 문장의 중간에 위치 하는 경우
 *  4. 공백이 문장의 맨 끝에 위치 하는 경우


 * 또 하나는, 입력 string의 공백 개수에 따른 동등분할 테스트 케이스
 * '공백'과 '탭'은 '동일한'것으로 간주하므로, 따로 구분하지 않았다.
 *  1. 문장만 한 글자인 경우
 *  2. 공백만 한 글자인 경우
 *  3. 공백만 두 글자인 경우
 *  4. 공백이 존재하지 않는 경우
 *  5. 공백이 하나 존재하는 경우
 *  6. 공백이 두 개 존재하는 경우
 *  7. 공백이 열 개 존재하는 경우
 * */


class ParagraphPartitionTesting {

    /** 입력 string의 공백 위치에 따른 동등분할 테스트 케이스 */
    String str;
    String str_front = "  front_blank!";
    String str_middle = "middle  blank!";
    String str_back = "back_blank!  ";

    // 1. 문장 자체가 존재 하지 않는 경우
    @Test
    void stringNullTest() {
        catWhiteSpace(str);
    }

    // 2. 공백이 문장의 맨 앞에 위치 하는 경우
    @Test
    void stringFrontBlankTest() {
        catWhiteSpace(str_front);
    }

    // 3. 공백이 문장의 중간에 위치 하는 경우
    @Test
    void stringMiddleBlankTest() {
        catWhiteSpace(str_middle);
    }

    // 4. 공백이 문장의 맨 끝에 위치 하는 경우
    @Test
    void stringBackBlankTest() {
        catWhiteSpace(str_back);
    }


    /** 입력 string의 공백 개수에 따른 동등분할 테스트 케이스 */
    String str_only_one_char = "a";
    String str_only_one_blank = " ";
    String str_only_two_blank = " \t";
    String str_no_blank = "no_black!";
    String str_one_blank = "one black!";
    String str_two_blank = "two\t blank!";
    String str_ten_blank = "ten \t \t \t \t \tblank!";

    // 1. 문장만 한 글자인 경우
    @Test
    void stringOnlyOneCharTest() {
        catWhiteSpace(str_only_one_char);
    }

    // 2. 공백만 한 글자인 경우
    @Test
    void stringOnlyOneBlankTest() {
        catWhiteSpace(str_only_one_blank);
    }

    // 3. 공백만 두 글자인 경우
    @Test
    void stringOnlyTwoBlankTest() {
        catWhiteSpace(str_only_two_blank);
    }

    // 4. 공백이 존재하지 않는 경우
    @Test
    void stringNoBlankTest() {
        catWhiteSpace(str_no_blank);
    }

    // 5. 공백이 하나 존재하는 경우
    @Test
    void stringOneBlankTest() {
        catWhiteSpace(str_one_blank);
    }

    // 6. 공백이 두 개 존재하는 경우
    @Test
    void stringTwoBlankTest() {
        catWhiteSpace(str_two_blank);
    }

    // 7. 공백이 열 개 존재하는 경우
    @Test
    void stringTenBlankTest() {
        catWhiteSpace(str_ten_blank);
    }
}