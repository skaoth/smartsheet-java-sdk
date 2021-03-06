package com.smartsheet.api.models;

/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2014 Smartsheet
 * %%
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
 * %[license]
 */

import com.smartsheet.api.models.enums.WidgetType;

public class Widget extends IdentifiableModel<Long> {
	
	/**
	 * Tyep of widget
	 */
	private WidgetType type;
	
	/**
	 * (Optional) Title of widget
	 */
	private String title;
	
	/**
	 * True indicates that the client should display the widget title.
	 */
	private Boolean showTitle;
	
	/**
	 * True indicates that the client should display the sheet icon in the widget
	 */
	private Boolean showTitleIcon;
	
	/**
	 * Contains the title format descriptor
	 */
	private String titleFormat;
	
	/**
	 * X-coordinate of widget's position on the Sight
	 */
	private Integer xPosition;
	
	/** 
	 * Y-coordinate of widget's position on the Sight
	 */
	private Integer yPosition;

	/** 
	 * Number of rows that the widget occupies
	 */
	private Integer height;
	
	/**
	 * Number of columns that the widget occupies
	 */
	private Integer width;
	
	/**
	 * Widget version number
	 */
	private Integer version;
	
	/**
	 * Data that specifies the contents of the widget.
	 * _Note: the type of WidgetContent object (and attributes within) will depend on the value of Widget.type:
	 *	CELLLINK - CellLinkWidgetContent
	 *	SHEETSUMMARY - CellLinkWidgetContent
	 *	RICHTEXT - RichTextWidgetContent
	 *	SHORTCUTICON - ShortcutWidgetContent
	 *	SHORTCUTLIST - ShortcutWidgetContent
	 *	GRIDGANTT - ReportWidgetContent
	 *	IMAGE - ImageWidgetContent
	 */
	private WidgetContent contents;
	
	/**
	 * Get the type of the widget
	 * 
	 * @return type
	 */
	public WidgetType getType() {
		return type;
	}
	
	/**
	 * Set the type of the widget
	 * 
	 * @param type
	 */
	public void setType(WidgetType type) {
		this.type = type;
	}
	
	/**
	 * Get the title of the widget.
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/** 
	 * Set the title of the widget.
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Get flag indicating if the client should display the widget title.
	 * 
	 * @return showTitle flag
	 */
	public Boolean getShowTitle() {
		return showTitle;
	}
	
	/**
	 * Set flag indicating if the client should display the widget title.
	 * 
	 * @param showTitle
	 */
	public void setShowTitle(Boolean showTitle) {
		this.showTitle = showTitle;
	}
	
	/**
	 * Get flag indicating if the client should display the sheet icon.
	 * 
	 * @return showTitleIcon flag
	 */
	public Boolean getShowTitleIcon() {
		return showTitleIcon;
	}
	
	/**
	 * Set flag indicating if the client should display the sheet icon.
	 * 
	 * @param showTitleIcon
	 */
	public void setShowTitleIcon(Boolean showTitleIcon) {
		this.showTitleIcon = showTitleIcon;
	}
	
	/**
	 * Get the title format descriptor string
	 * 
	 * @return titleFormat
	 */
	public String getTitleFormat() {
		return titleFormat;
	}
	
	/**
	 * Set the title format descriptor string
	 * 
	 * @param titleFormat
	 */
	public void setTitleFormat(String titleFormat) {
		this.titleFormat = titleFormat;
	}
	
	/** 
	 * Get the x-coordinate of widget's position on the sight.
	 * 
	 * @return xPosition
	 */
	public Integer getXPosition() {
		return xPosition;
	}
	
	/**
	 * Set the x-coordinate of widget's position on the sight.
	 * 
	 * @param xPosition
	 */
	public void setXPosition(Integer xPosition) {
		this.xPosition = xPosition;
	}
	
	/**
	 * Get the y-coordinate of widget's position on the sight.
	 * 
	 * @return yPosition
	 */
	public Integer getYPosition() {
		return yPosition;
	}
	
	/**
	 * Set the y-coordinate of widget's position on the sight.
	 * 
	 * @param yPosition
	 */
	public void setYPosition(Integer yPosition) {
		this.yPosition = yPosition;
	}
	
	/**
	 * Get the number of rows that the widget occupies
	 * 
	 * @return height
	 */
	public Integer getHeight() {
		return height;
	}
	
	/**
	 * Set the number of rows that the widget occupies
	 * 
	 * @param height
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	/**
	 * Get the number of columns that the widget occupies
	 * 
	 * @return width
	 */
	public Integer getWidth() {
		return width;
	}
	
	/**
	 * Set the number of columns that the widget occupies
	 * 
	 * @param width
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	/**
	 * Get the widget version number
	 * 
	 * @return version
	 */
	public Integer getVersion() {
		return version;
	}
	
	/** 
	 * Set the widget version number
	 * 
	 * @param version
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	/**
	 * Get the data that specifies the contents of the widget. 
	 * See description of contents variable for valid objects
	 * 
	 * @return contents
	 */
	public WidgetContent getContents() {
		return contents;
	}
	
	/**
	 * Get the data that specifies the contents of the widget. 
	 * See description of contents variable for valid objects
	 * 
	 * @param contents
	 */
	public void setContents(WidgetContent contents) {
		this.contents = contents;
	}
}
