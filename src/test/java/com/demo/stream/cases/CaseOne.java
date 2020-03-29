package com.demo.stream.cases;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类名称：CaseOne
 * ********************************
 * <p>
 * 类描述：案例一
 * 重点讲解：anyMatch的使用方式
 *
 * @author zhangxiaoxi
 * @date 下午9:22
 */
public class CaseOne {

    /**
     * 考试成绩模型
     */
    @Data
    @AllArgsConstructor
    class ExamStudentScore {
        /**
         * 学生姓名
         */
        private String studentName;
        /**
         * 成绩
         */
        private Integer scoreValue;
        /**
         * 科目
         */
        private String subject;
    }

    /**
     * 学生考试成绩
     */
    Map<String, List<ExamStudentScore>> studentMap;

    @Before
    public void init() {
        studentMap = new HashMap<>();

        List<ExamStudentScore> zsScoreList = new ArrayList<>();
        zsScoreList.add(
                new ExamStudentScore(
                        "张三",
                        30,
                        "CHINESE"));
        zsScoreList.add(
                new ExamStudentScore(
                        "张三",
                        40,
                        "ENGLISH"));
        zsScoreList.add(
                new ExamStudentScore(
                        "张三",
                        50,
                        "MATHS"));
        studentMap.put("张三", zsScoreList);

        List<ExamStudentScore> lsScoreList = new ArrayList<>();
        lsScoreList.add(
                new ExamStudentScore(
                        "李四",
                        80,
                        "CHINESE"));
        lsScoreList.add(
                new ExamStudentScore(
                        "李四",
                        null,
                        "ENGLISH"));
        lsScoreList.add(
                new ExamStudentScore(
                        "李四",
                        100,
                        "MATHS"));
        studentMap.put("李四", lsScoreList);

        List<ExamStudentScore> wwScoreList = new ArrayList<>();
        wwScoreList.add(
                new ExamStudentScore(
                        "王五",
                        null,
                        "CHINESE"));
        wwScoreList.add(
                new ExamStudentScore(
                        "王五",
                        null,
                        "ENGLISH"));
        wwScoreList.add(
                new ExamStudentScore(
                        "王五",
                        70,
                        "MATHS"));
        studentMap.put("王五", wwScoreList);
    }

    @Test
    public void findStudent() {
        //mycode -> 问题 会重复打印结果 ->原因  中间操作foreach会遍历所有的数据  只要满足条件就打印 ->这里可以使用anyMatch 减少循环次数
        studentMap.forEach((key,value) ->
                {
                    value.stream().forEach(score -> {
                        if (score.getScoreValue() == null ){
                            System.out.println(key);
                        }
                    });
                }
                );

        System.out.println("--------------------anymatch-------------------");
        studentMap.forEach((studentName, scoreList) -> {

            boolean bool = scoreList.stream()
                    .anyMatch(score -> {
                        // TODO anyMatch找到任意一条符合条件的数据后就停止
//                        System.out.println(score);

                        return score.getScoreValue() == null;
                    });

            if (bool) {
                System.out.println("此学生[ " + studentName + " ]有缺考情况！");
            }
        });
    }



}
