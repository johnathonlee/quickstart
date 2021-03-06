/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 *
 * (C) 2007, 2009 @author JBoss Inc
 */
package org.jboss.jbossts.txbridge.demo.bistro;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

/**
 * EJB3 Entity Bean implementation of the business app state.
 *
 * @author jonathan.halliday@redhat.com, 2007-04-30
 */
@Entity
@Table(name = "bistros")
public class BistroEntityImpl implements Serializable
{
	private int id;
	private int bookingCount;

	public BistroEntityImpl () { }

	@Id
	@GeneratedValue
	public int getId ()
    {
		return id;
	}

	public void setId (int id)
    {
		this.id = id;
	}

	public int getBookingCount()
	{
		return bookingCount;
	}

	public void setBookingCount(int bookingCount)
	{
		this.bookingCount = bookingCount;
	}

	public void increaseBookingCount(int how_many)
    {
		setBookingCount( getBookingCount() + how_many );
	}
}
