package com.jbmp.restserver.data;

import java.time.LocalDate;

public class Offer
{
  private final String category;
  private final LocalDate dateFrom;
  private final LocalDate dateTo;
  private final String description;
  private final String location;
  private final Long price;

  @Override
  public String toString ()
  {
    return "Offer{" + "category='" + category + '\'' + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", description='" + description + '\'' + ", location='" + location + '\'' + ", price=" + price + '}';
  }

  public String getCategory ()
  {
    return category;
  }

  public LocalDate getDateFrom ()
  {
    return dateFrom;
  }

  public LocalDate getDateTo ()
  {
    return dateTo;
  }

  public String getDescription ()
  {
    return description;
  }

  public String getLocation ()
  {
    return location;
  }

  public Long getPrice ()
  {
    return price;
  }

  public Offer (String category, LocalDate dateFrom, LocalDate dateTo, String description, String location, Long price)
  {
    this.category = category;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.description = description;
    this.location = location;
    this.price = price;
  }
}
