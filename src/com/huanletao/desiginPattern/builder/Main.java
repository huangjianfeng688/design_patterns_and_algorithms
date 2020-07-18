package com.huanletao.desiginPattern.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 21:23
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain terrain = builder.buildFort()
                .buildMine()
                .buildWall()
                .build();

        Person person = new Person.PersonBuilder()
                .baseInfo(12, "jack", 24)
                .socre(12)
                .weight(124)
                .address("124", 45)
                .build();
    }
}
