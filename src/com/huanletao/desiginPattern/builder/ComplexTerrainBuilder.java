package com.huanletao.desiginPattern.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 21:20
 * Description:
 */
public class ComplexTerrainBuilder implements TerrainBuilder {
    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildWall() {
        terrain.a = new Wall(10,3,4,2);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.m = new Mine(10,5,4,2);
        return this;
    }

    @Override
    public TerrainBuilder buildFort() {
        terrain.f = new Fort(12,45,78,45);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
