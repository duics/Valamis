package com.arcusys.learn.setting.storage.impl

import com.arcusys.learn.storage.impl.{ EntityStorageExt, KeyedEntityStorageExt }
import com.arcusys.valamis.settings.model.{ SettingType, Setting }
import com.arcusys.valamis.settings.storage.SettingStorage

/**
 * User: Yulia.Glushonkova
 * Date: 02.10.13
 */
trait SettingEntityStorage extends SettingStorage with KeyedEntityStorageExt[Setting] with EntityStorageExt[Setting] {
  def getByKey(key: SettingType.Value): Option[Setting] = {
    getOne("key" -> key.toString)
  }

  def modify(key: SettingType.Value, value: String) {
    val item = getByKey(key)
    if (item.isDefined) modify("key" -> key.toString, "value" -> value)
    else createAndGetID("key" -> key.toString, "value" -> value)
  }
}
