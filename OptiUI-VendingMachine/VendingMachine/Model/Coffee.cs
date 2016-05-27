using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Model
{
    public enum CupSize
    {
        [Description("Small")]
        Small,
        [Description("Medium")]
        Medium,
        [Description("Large")]
        Large
    }
    public class Coffee
    {
        public CupSize Size { get; set; }
        public decimal Price { get; set; }
    }
}
