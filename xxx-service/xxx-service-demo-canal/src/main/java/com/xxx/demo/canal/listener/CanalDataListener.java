package com.xxx.demo.canal.listener;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.xpand.starter.canal.annotation.*;

/**
 * @author 张咪
 * @history 2020/3/3 新建
 * @since JDK1.7
 */
@CanalEventListener
public class CanalDataListener {


    @InsertListenPoint
    public void onInsertEvent(CanalEntry.EventType eventType,CanalEntry.RowData rowData){
        for (CanalEntry.Column column : rowData.getAfterColumnsList()) {
            System.out.println("列名："+ column.getName()+"值："+column.getValue());
        }
    }

    @UpdateListenPoint
    public void onUpdateEvent(CanalEntry.EventType eventType,CanalEntry.RowData rowData){
        for (CanalEntry.Column column : rowData.getBeforeColumnsList()) {
            System.out.println("前列名："+ column.getName()+"前值："+column.getValue());
        }
        for (CanalEntry.Column column : rowData.getAfterColumnsList()) {
            System.out.println("后列名："+ column.getName()+"后值："+column.getValue());
        }
    }

    @DeleteListenPoint
    public void onDeleteEvent(CanalEntry.EventType eventType,CanalEntry.RowData rowData){
        for (CanalEntry.Column column : rowData.getBeforeColumnsList()) {
            System.out.println("前列名："+ column.getName()+"前值："+column.getValue());
        }
    }

    @ListenPoint(destination = "example",schema = "changgou_goods",table = "brand",eventType = CanalEntry.EventType.INSERT)
    public void onCustomEvent(CanalEntry.EventType eventType,CanalEntry.RowData rowData){
        for (CanalEntry.Column column : rowData.getAfterColumnsList()) {
            System.out.println("---列名："+ column.getName()+"---值："+column.getValue());
        }
    }
}
