package com.huanletao.desiginPattern.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 21:16
 * Description: TerrainBuilder 地形建造者接口。
 */
public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildMine();
    TerrainBuilder buildFort();
    Terrain build();
}
