/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: StudentList.java
 * @Package com.life.design.pattern.iterator.student
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 下午1:52:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.iterator.student;

import java.util.List;

import com.life.design.pattern.iterator.AbstractIterator;
import com.life.design.pattern.iterator.AbstractObjectList;

/**
 * @Title: StudentList
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 下午1:52:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class StudentList  extends AbstractObjectList<Student>{

	@Override
	public AbstractIterator<Student> iterator() {
		return new StudentIterator();
	}
	
	
	public class StudentIterator implements AbstractIterator<Student>{
		
		private int cursor1;
		
		private int cursor2;
		
		private List<Student> students;
		
		public StudentIterator() {
			super();
			this.cursor1 = -1;
			this.students = StudentList.this.getList();
			//jdk8给list添加了sort方法
			this.students.sort((s1,s2)->s1.getAge()-s2.getAge());
			//Collections.sort(this.students, (s1,s2)->s1.getAge()-s2.getAge());
			this.cursor2 = students.size();
		}

		@Override
		public boolean hasNext() {
			return cursor1<students.size()-1;
		}

		@Override
		public Student next() {
			if (cursor1==students.size()-1) throw new IndexOutOfBoundsException("没有更多的学生");
			return students.get(++cursor1);
		}

		@Override
		public boolean hasPrevious() {
			return cursor2>0;
		}

		@Override
		public Student previous() {
			if (cursor2==0) throw new IndexOutOfBoundsException("没有更多的学生");
			return students.get(--cursor2);
		}
	}
}
